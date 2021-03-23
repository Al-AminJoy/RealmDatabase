package com.alamin.realmdatabase;

import io.realm.RealmModel;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Skills extends RealmObject {
    @PrimaryKey
    @Required
    public String skillName;
}
