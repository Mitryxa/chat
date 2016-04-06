package services;

import dao.Dao;

/**
 * Created by Mitruxa on 03.04.2016.
 */
public class Service {
public static String saveName(String name){
    return Dao.saveName(name);
}
}
