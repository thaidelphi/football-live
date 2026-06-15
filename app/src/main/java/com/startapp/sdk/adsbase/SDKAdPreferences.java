package com.startapp.sdk.adsbase;

import com.ironsource.b9;
import java.io.Serializable;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class SDKAdPreferences implements Serializable {
    private static final long serialVersionUID = 2055046185195723724L;
    private Gender gender = null;
    private String age = null;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum Gender {
        MALE("m"),
        FEMALE("f");
        
        private String gender;

        Gender(String str) {
            this.gender = str;
        }

        public static Gender parseString(String str) {
            Gender[] values;
            for (Gender gender : values()) {
                if (gender.getGender().equals(str)) {
                    return gender;
                }
            }
            return null;
        }

        public String getGender() {
            return this.gender;
        }

        @Override // java.lang.Enum
        public String toString() {
            return getGender();
        }
    }

    public String getAge() {
        return this.age;
    }

    public Gender getGender() {
        return this.gender;
    }

    public SDKAdPreferences setAge(int i10) {
        this.age = Integer.toString(i10);
        return this;
    }

    public SDKAdPreferences setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public String toString() {
        return "SDKAdPreferences [gender=" + this.gender + ", age=" + this.age + b9.i.f16698e;
    }

    public SDKAdPreferences setAge(String str) {
        this.age = str;
        return this;
    }
}
