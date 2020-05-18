package com.mtanevski.designpatterns.gof.composite.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Composite
public class Container implements Component {

    private String name;
    private int x;
    private int y;
    private int width;
    private int height;

    private final List<Component> components = new ArrayList<>();

    public Container(String name) {
        this.name = name;
    }

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getWidth(){
        return width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    public List<Component> getChildren(){
        return components;
    }

    public void add(Component component){
        this.components.add(component);
    }

    public void remove(Component component){
        this.components.remove(component);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String render() {
        String joined = this.components.stream()
                .map(Component::render).collect(Collectors.joining(","));
        return name + ":[" + joined + "]";
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                (components.isEmpty() ? "" : "components=" + components) +
                '}';
    }
}
