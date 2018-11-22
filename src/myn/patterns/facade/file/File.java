package myn.patterns.facade.file;

/**
 * @author Senin Yuriy
 */

class File {
    /**
     * Шлях до файлу
     */
    private String path;

    /**
     * Порожный конструктор.
     */
    public File() {
    }

    /**
     * Відкриття існуючого файлу або створення нового файлу.
     *
     * @param path             Шлях до файлу.
     * @param createIfNotExist При створенні IfNotExist дійсний файл буде створено,
     *                         якщо дійсний файл не існує або скорочений до 0 довжини.
     */
    public void open(String path, boolean createIfNotExist) {
        this.path = path;
        System.out.println("Opening the file " + this.path + ". If it doesn`t exist file will be created\n");
    }

    /**
     * Закритя файлу.
     */
    public void close() {
        System.out.println("The file " + path + " has been closed.\n");
    }

    /**
     * Видаленя файлу по шляху.
     *
     * @param path The way to file.
     */
    public void delete(String path) {
        System.out.println("The file " + path + " has been deleted.\n");
    }

    public void Output (){
        System.out.println("This file : "+ path);
    }
}
