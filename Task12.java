import java.io.File;

class Task12 {

    /**
     * TO-DO: Change this method to be recursive.
     * \*
     * This method searches for a file with a specific name within a directory
     * and its subdirectories. The current implementation uses a Queue for an
     * iterative, breadth-first search.
     * \*
     *
     * @param rootDir  The directory to start the search from.
     * @param fileName The name of the file to find.
     * @return The File object if found, otherwise null.
     */
    public File findFileByName(File rootDir, String fileName) {
        if (rootDir.isDirectory()) {
            return null;
        }

        File[] files = rootDir.listFiles();
        if (files == null) {
            return null;
        }
        for (File file : files) {
            if (file.isDirectory()) {
                File found = findFileByName(file, fileName);
                if (found != null) {
                    return found;
                }
            } else if (file.getName().equals(fileName)) {
                return file;
            }
        }
            return null;
        }
    }