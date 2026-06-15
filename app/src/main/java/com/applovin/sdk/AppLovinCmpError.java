package com.applovin.sdk;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface AppLovinCmpError {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum Code {
        UNSPECIFIED(-1),
        INTEGRATION_ERROR(1),
        FORM_UNAVAILABLE(2),
        FORM_NOT_REQUIRED(3);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f9959a;

        Code(int i10) {
            this.f9959a = i10;
        }

        public int getValue() {
            return this.f9959a;
        }
    }

    int getCmpCode();

    String getCmpMessage();

    Code getCode();

    String getMessage();
}
