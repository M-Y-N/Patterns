package com.File.java;

/**
 * @author Senin Yuriy
 */

class Directory {
    /**
     * Шлях до каталогу.
     */
    private int count = 0;
    private String path;

    /**
     * Об'єкти класу File, що представляє реальні файли.
     */
    private File[] filesIn;
    /**
     * Об'єкти класу com.File.java.Directory, що представляє реальні каталоги.
     */
    private Directory[] directorysIn;

    /**
     * Порожній конструктор.
     */
    public Directory() {

    }

    /**
     * Створює каталог.
     *
     * @param path Шлях до каталогy.
     */
    public void create(String path) {
        this.path = path;
        System.out.println("Creating the directory " + path + ".\n");
    }

    /**
     * Видаляє каталог із заданаго шляхом.
     *
     * @param path Шлях до каталогу.
     */
    public void rmdir(String path) {
        System.out.println("Deleting the directory " + path + ".\n");
    }

    public void AddDirec(Directory directory) {
        if (directorysIn == null)
            directorysIn = new Directory[1];
        directorysIn[0] = directory;

    }

    public void AddFile(File file) {
        if (filesIn == null)
            filesIn = new File[4];

        filesIn[count] = file;
        count++;

    }

    public void contains(Directory directory) {
        System.out.println(path + " directory consist of : ");
        if (filesIn != null) {
            for (File file : filesIn) {
                if (file != null)
                    file.Output();
            }

        }
        if (directorysIn != null) {
            for (int i = 0; i < directorysIn.length; i++) {
                if (directorysIn[i] != null)
                    directorysIn[i].contains(directorysIn[i]);
            }
        }
        System.out.println("End directory "+ path);
    }
}
