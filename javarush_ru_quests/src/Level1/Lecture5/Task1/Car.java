package Level1.Lecture5.Task1;

//  Двигатель — сердце автомобиля
//  Требования:
//        •	В классе Car нужно создать внутренний класс (inner class) Engine.
//        •	В классе Engine должно существовать приватное поле isRunning типа boolean.
//        •	В классе Engine должен существовать публичный метод void start, который устанавливает значение true полю isRunning.
//        •	В классе Engine должен существовать публичный метод void stop, который устанавливает значение false полю isRunning.
//        •	В классе Car должно существовать поле engine типа Engine.

public class Car {

    Engine engine = new Engine();

    class Engine{
        private boolean isRunning;
        public void start(){
            isRunning = true;
        }

        public void stop(){
            isRunning = false;
        }
    }

}
