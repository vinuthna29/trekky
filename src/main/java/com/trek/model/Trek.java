package com.trek.model;

public class Trek {
    private Integer id;
    private String name;
    private String description;
//    public Trek(int id, String name, String description){
//        this.id=id;
//        this.name=name;
//        this.description=description;
//    }

    // getters
    public Integer getId(){
        return  id;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
