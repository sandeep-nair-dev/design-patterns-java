package org.sandeep.F2_StructuralPatterns.Composite.FileSystemSolution;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent{
    private final String directoryName;
    List<FileSystemComponent> componentList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.componentList = new ArrayList<>();
    }

    public void add(FileSystemComponent component){
        componentList.add(component);
    }

    @Override
    public void ls(int indentation) {
        System.out.println("--".repeat(indentation) + "Directory name: "+ directoryName);
        for(FileSystemComponent component: componentList){
            component.ls(indentation+1);
        }
    }
}
