package com.applovin.impl.sdk;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppLovinError {
    public static final AppLovinError NO_FILL = new AppLovinError(204, "No Fill");

    /* renamed from: a  reason: collision with root package name */
    private final int f8675a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8676b;

    public AppLovinError(int i10, String str) {
        this.f8675a = i10;
        this.f8676b = str;
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof AppLovinError;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AppLovinError) {
            AppLovinError appLovinError = (AppLovinError) obj;
            if (appLovinError.canEqual(this) && getCode() == appLovinError.getCode()) {
                String message = getMessage();
                String message2 = appLovinError.getMessage();
                return message != null ? message.equals(message2) : message2 == null;
            }
            return false;
        }
        return false;
    }

    public int getCode() {
        return this.f8675a;
    }

    public String getMessage() {
        return this.f8676b;
    }

    public int hashCode() {
        String message = getMessage();
        return ((getCode() + 59) * 59) + (message == null ? 43 : message.hashCode());
    }

    public String toString() {
        return "AppLovinError(code=" + getCode() + ", message=" + getMessage() + ")";
    }
}
