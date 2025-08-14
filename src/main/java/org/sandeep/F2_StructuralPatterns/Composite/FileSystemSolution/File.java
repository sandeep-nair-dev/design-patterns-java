package org.sandeep.F2_StructuralPatterns.Composite.FileSystemSolution;

public class File implements FileSystemComponent{
    private String fileName;

    public File(String name){
        this.fileName=name;
    }

    @Override
    public void ls(int indentation) {
        System.out.println("--".repeat(indentation) + "File name: " + fileName);
    }
}
