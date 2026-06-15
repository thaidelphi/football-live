package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class r8 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f19931a = true;

    /* renamed from: b  reason: collision with root package name */
    private IronSourceError f19932b = null;

    public IronSourceError a() {
        return this.f19932b;
    }

    public void a(IronSourceError ironSourceError) {
        this.f19931a = false;
        this.f19932b = ironSourceError;
    }

    public boolean b() {
        return this.f19931a;
    }

    public void c() {
        this.f19931a = true;
        this.f19932b = null;
    }

    public String toString() {
        StringBuilder sb;
        if (b()) {
            sb = new StringBuilder();
            sb.append("valid:");
            sb.append(this.f19931a);
        } else {
            sb = new StringBuilder();
            sb.append("valid:");
            sb.append(this.f19931a);
            sb.append(", IronSourceError:");
            sb.append(this.f19932b);
        }
        return sb.toString();
    }
}
