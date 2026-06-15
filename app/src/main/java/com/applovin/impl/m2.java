package com.applovin.impl;

import java.util.Collections;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class m2 implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    private final String f7493a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7494b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7495c;

    /* renamed from: d  reason: collision with root package name */
    private final y2 f7496d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m2(String str, String str2, boolean z10, y2 y2Var) {
        this.f7493a = str;
        this.f7494b = str2;
        this.f7495c = z10;
        this.f7496d = y2Var;
    }

    public String a() {
        return this.f7494b;
    }

    public List b() {
        List l10 = this.f7496d.l();
        return (l10 == null || l10.isEmpty()) ? Collections.singletonList(this.f7493a) : l10;
    }

    public String c() {
        return this.f7493a;
    }

    public y2 d() {
        return this.f7496d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m2 m2Var = (m2) obj;
        String str = this.f7493a;
        if (str == null ? m2Var.f7493a == null : str.equals(m2Var.f7493a)) {
            String str2 = this.f7494b;
            if (str2 == null ? m2Var.f7494b == null : str2.equals(m2Var.f7494b)) {
                return this.f7495c == m2Var.f7495c;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f7493a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7494b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f7495c ? 1 : 0);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(m2 m2Var) {
        return this.f7494b.compareToIgnoreCase(m2Var.f7494b);
    }
}
