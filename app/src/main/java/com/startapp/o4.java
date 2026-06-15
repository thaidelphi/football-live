package com.startapp;

import com.startapp.sdk.jobs.JobRequest;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class o4 {

    /* renamed from: a  reason: collision with root package name */
    public final t7 f22345a;

    /* renamed from: b  reason: collision with root package name */
    public final t7 f22346b;

    public o4(t7 t7Var, t7 t7Var2) {
        this.f22345a = t7Var;
        this.f22346b = t7Var2;
    }

    public final void a(JobRequest... jobRequestArr) {
        for (JobRequest jobRequest : jobRequestArr) {
            if (jobRequest.f23331d) {
                com.startapp.sdk.jobs.d dVar = (com.startapp.sdk.jobs.d) jobRequest;
                this.f22346b.a(dVar, dVar.f23346e.longValue());
            } else {
                com.startapp.sdk.jobs.d dVar2 = (com.startapp.sdk.jobs.d) jobRequest;
                this.f22345a.a(dVar2, dVar2.f23346e.longValue());
            }
        }
    }
}
