package service;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.ejb.Singleton;

@Singleton
public class SingletonData
{
   int ID_User;
    private SingletonData()
    {}

    private static SingletonData INSTANCE = new SingletonData();

    public static SingletonData getInstance()
    {   return INSTANCE;
    }

    public int getID_User() {
        return ID_User;
    }

    public void setID_User(int ID_User) {
        this.ID_User = ID_User;
    }
}