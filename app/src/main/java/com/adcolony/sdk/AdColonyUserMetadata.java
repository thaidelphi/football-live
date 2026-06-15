package com.adcolony.sdk;

import android.location.Location;
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdColonyUserMetadata {
    public static final String USER_EDUCATION_ASSOCIATES_DEGREE = "associates_degree";
    public static final String USER_EDUCATION_BACHELORS_DEGREE = "bachelors_degree";
    public static final String USER_EDUCATION_GRADE_SCHOOL = "grade_school";
    public static final String USER_EDUCATION_GRADUATE_DEGREE = "graduate_degree";
    public static final String USER_EDUCATION_HIGH_SCHOOL_DIPLOMA = "high_school_diploma";
    public static final String USER_EDUCATION_SOME_COLLEGE = "some_college";
    public static final String USER_EDUCATION_SOME_HIGH_SCHOOL = "some_high_school";
    public static final String USER_FEMALE = "female";
    public static final String USER_MALE = "male";
    public static final String USER_MARRIED = "married";
    public static final String USER_SINGLE = "single";

    /* renamed from: a  reason: collision with root package name */
    e1 f5734a = c0.a();

    /* renamed from: b  reason: collision with root package name */
    f1 f5735b = c0.b();

    /* renamed from: c  reason: collision with root package name */
    Location f5736c;

    public AdColonyUserMetadata addUserInterest(String str) {
        if (z0.e(str)) {
            c0.a(this.f5734a, str);
            c0.a(this.f5735b, "adc_interests", this.f5734a);
        }
        return this;
    }

    public AdColonyUserMetadata clearUserInterests() {
        e1 a10 = c0.a();
        this.f5734a = a10;
        c0.a(this.f5735b, "adc_interests", a10);
        return this;
    }

    public Object getMetadata(String str) {
        return c0.g(this.f5735b, str);
    }

    public int getUserAge() {
        return c0.d(this.f5735b, "adc_age");
    }

    public int getUserAnnualHouseholdIncome() {
        return c0.d(this.f5735b, "adc_household_income");
    }

    public String getUserEducation() {
        return c0.h(this.f5735b, "adc_education");
    }

    public String getUserGender() {
        return c0.h(this.f5735b, "adc_gender");
    }

    public String[] getUserInterests() {
        return this.f5734a.d();
    }

    public Location getUserLocation() {
        return this.f5736c;
    }

    public String getUserMaritalStatus() {
        return c0.h(this.f5735b, "adc_marital_status");
    }

    public String getUserZipCode() {
        return c0.h(this.f5735b, "adc_zip");
    }

    public AdColonyUserMetadata setMetadata(String str, boolean z10) {
        if (z0.e(str)) {
            c0.b(this.f5735b, str, z10);
        }
        return this;
    }

    public AdColonyUserMetadata setUserAge(int i10) {
        setMetadata("adc_age", i10);
        return this;
    }

    public AdColonyUserMetadata setUserAnnualHouseholdIncome(int i10) {
        setMetadata("adc_household_income", i10);
        return this;
    }

    public AdColonyUserMetadata setUserEducation(String str) {
        if (z0.e(str)) {
            setMetadata("adc_education", str);
        }
        return this;
    }

    public AdColonyUserMetadata setUserGender(String str) {
        if (z0.e(str)) {
            setMetadata("adc_gender", str);
        }
        return this;
    }

    public AdColonyUserMetadata setUserLocation(Location location) {
        this.f5736c = location;
        setMetadata("adc_longitude", location.getLongitude());
        setMetadata("adc_latitude", location.getLatitude());
        setMetadata("adc_speed", location.getSpeed());
        setMetadata("adc_altitude", location.getAltitude());
        setMetadata("adc_time", location.getTime());
        setMetadata("adc_accuracy", location.getAccuracy());
        return this;
    }

    public AdColonyUserMetadata setUserMaritalStatus(String str) {
        if (z0.e(str)) {
            setMetadata("adc_marital_status", str);
        }
        return this;
    }

    public AdColonyUserMetadata setUserZipCode(String str) {
        if (z0.e(str)) {
            setMetadata("adc_zip", str);
        }
        return this;
    }

    public AdColonyUserMetadata setMetadata(String str, double d10) {
        if (z0.e(str)) {
            c0.a(this.f5735b, str, d10);
        }
        return this;
    }

    public AdColonyUserMetadata setMetadata(String str, String str2) {
        if (z0.e(str2) && z0.e(str)) {
            c0.a(this.f5735b, str, str2);
        }
        return this;
    }
}
