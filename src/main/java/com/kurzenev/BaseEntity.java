package com.kurzenev;

public class BaseEntity {
    private Long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                '}';
    }
    public boolean isNew(){
        return(this.id == null);
    }
}
