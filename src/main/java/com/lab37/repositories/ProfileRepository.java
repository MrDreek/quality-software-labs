package com.lab37.repositories;

import com.lab37.models.Profile;
import com.lab37.models.Profiles;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class ProfileRepository {
    private final Profiles profiles;

    public ProfileRepository() throws JAXBException {
        this.profiles = init();
    }

    public static Profiles init() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Profiles.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        File file = new File("data/profiles.xml");
        if (file.exists()) {
            Profiles profiles = (Profiles) jaxbUnmarshaller.unmarshal(file);
            return profiles.getProfiles().size() > 0 ? profiles : new Profiles();
        } else {
            return new Profiles();
        }
    }

    public Profile find(String login) {
        var profile = this.profiles.getProfiles()
                .stream()
                .filter(p -> p.getName().equals(login))
                .findAny()
                .orElse(null);

        if (profile == null) {
            return new Profile(login);
        }

        return profile;
    }

    public void save(Profile profile) {
        if (!this.profiles.getProfiles().contains(profile)) {
            this.profiles.getProfiles().add(profile);
        }
    }

    public void saveAll() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Profiles.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        //Marshal the profiles list in file
        jaxbMarshaller.marshal(this.profiles, new File("data/profiles.xml"));
    }
}
