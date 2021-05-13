package com.lab37;

//"Приложение позволяет указать вид тренировки: отжимание, скакалка, приседания." +
//" Доступны команды: начать тренировку (запускается таймер тренировки), закончить тренировку (таймер останавливается). " +
//"За отработанное время высчитывается количество потраченных калорий по формуле K*t=cal, где K - количество калорий в час, " +
//"затрачиваемое на определенный вид тренировки, t - время, засеченное трекером. От запуска к запуску программы данные должны" +
//" сохраняться и общее количество калорий - суммироваться.
//Персистенция данных приложения с помощью ObjectOutputStream +5 баллов или JAXB + 10 баллов
//Поддержка нескольких профилей пользователей приложением + 5 баллов"

import com.lab37.models.Workout;
import com.lab37.repositories.ProfileRepository;
import com.lab37.repositories.WorkoutRepository;

import javax.xml.bind.JAXBException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws JAXBException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите логин:");

        String login = sc.nextLine();

        ProfileRepository pr = new ProfileRepository();
        WorkoutRepository wr = new WorkoutRepository();

        var profile = pr.find(login);

        System.out.println("Добро пожаловать, " + profile.getName() + '!');
        if (profile.getColories() == 0.0) {
            System.out.println("Новый профиль был создан, удачи в тренировках!");
        } else {
            System.out.println("Количество сброшенных колорий - " + profile.getColories() + ". Так держать!");
        }

        do {
            System.out.println("Выберите упражнение - отжимание(1), скакалка(2), приседания(3), либо введите exit, чтобы сохранить данные и выйти");

            String request = sc.next();
            if (request.equals("exit")) {
                pr.save(profile);
                break;
            }
            try {
                String type;
                switch (request) {
                    case "1" -> type = "Отжимания";
                    case "2" -> type = "Скакалка";
                    case "3" -> type = "Приседания";
                    default -> {
                        System.out.println("Неизвестная команда!");
                        continue;
                    }
                }

                Workout workout = wr.find(type);
                WorkoutService ws = new WorkoutService(workout);
                var colories = ws.run();

                profile.increaseSum(colories);
            } catch (Exception e) {
                System.out.println("Что-то пошло не так!");
                return;
            }
        } while (true);

        System.out.println("Накопленная сумма калорий - " + String.format("%.2f", profile.getColories()));
        System.out.println("До свидания, " + profile.getName());

        try {
            pr.saveAll();
        } catch (JAXBException e) {
            System.out.println("Ой-ой, сохранение не удалось!");
        }
    }
}