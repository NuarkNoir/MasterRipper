package xyz.nuark.mobile.masterripper.core.rippers;

/**
 * Created with love by Nuark on 21.01.2018.
 */

public abstract class AbstractRipper implements Runnable {

    //TODO Добавить: Интерфейс проверки правильности URL
    //TODO Добавить: Хранилище для ссылок
    //TODO Добавить: Интерфейс парсера
    public String HOSTNAME;

    @Override
    public abstract void run();
}
