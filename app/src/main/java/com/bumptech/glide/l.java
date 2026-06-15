package com.bumptech.glide;

import com.bumptech.glide.l;
/* compiled from: TransitionOptions.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class l<CHILD extends l<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private q2.c<? super TranscodeType> f10329a = q2.a.b();

    /* renamed from: c */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e8) {
            throw new RuntimeException(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final q2.c<? super TranscodeType> d() {
        return this.f10329a;
    }
}
