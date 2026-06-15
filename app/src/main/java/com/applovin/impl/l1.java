package com.applovin.impl;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class l1 {

    /* renamed from: b  reason: collision with root package name */
    private final String f7441b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f7442c;

    /* renamed from: a  reason: collision with root package name */
    private final String f7440a = UUID.randomUUID().toString();

    /* renamed from: d  reason: collision with root package name */
    private final long f7443d = System.currentTimeMillis();

    public l1(String str, Map map) {
        this.f7441b = str;
        this.f7442c = map;
    }

    public long a() {
        return this.f7443d;
    }

    public String b() {
        return this.f7440a;
    }

    public String c() {
        return this.f7441b;
    }

    public Map d() {
        return this.f7442c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l1 l1Var = (l1) obj;
        if (this.f7443d == l1Var.f7443d && Objects.equals(this.f7441b, l1Var.f7441b) && Objects.equals(this.f7442c, l1Var.f7442c)) {
            return Objects.equals(this.f7440a, l1Var.f7440a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f7441b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f7442c;
        int hashCode2 = map != null ? map.hashCode() : 0;
        long j10 = this.f7443d;
        int i10 = (((hashCode + hashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str2 = this.f7440a;
        return i10 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Event{name='" + this.f7441b + "', id='" + this.f7440a + "', creationTimestampMillis=" + this.f7443d + ", parameters=" + this.f7442c + '}';
    }
}
