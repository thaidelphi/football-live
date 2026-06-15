package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IFragmentWrapper;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class SupportFragmentWrapper extends IFragmentWrapper.Stub {

    /* renamed from: a  reason: collision with root package name */
    private final Fragment f12793a;

    private SupportFragmentWrapper(Fragment fragment) {
        this.f12793a = fragment;
    }

    @KeepForSdk
    public static SupportFragmentWrapper Z(Fragment fragment) {
        if (fragment != null) {
            return new SupportFragmentWrapper(fragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void G(boolean z10) {
        this.f12793a.I1(z10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void R(Intent intent) {
        this.f12793a.Q1(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void T(Intent intent, int i10) {
        this.f12793a.startActivityForResult(intent, i10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void m0(boolean z10) {
        this.f12793a.P1(z10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzA() {
        return this.f12793a.n0();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzb() {
        return this.f12793a.z();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzc() {
        return this.f12793a.U();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final Bundle zzd() {
        return this.f12793a.n();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zze() {
        return Z(this.f12793a.D());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zzf() {
        return Z(this.f12793a.T());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper zzg() {
        return ObjectWrapper.u0(this.f12793a.i());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper zzh() {
        return ObjectWrapper.u0(this.f12793a.K());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper zzi() {
        return ObjectWrapper.u0(this.f12793a.W());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final String zzj() {
        return this.f12793a.S();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzk(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.t0(iObjectWrapper);
        Preconditions.m(view);
        this.f12793a.u1(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzl(boolean z10) {
        this.f12793a.G1(z10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzn(boolean z10) {
        this.f12793a.N1(z10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzr(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.t0(iObjectWrapper);
        Preconditions.m(view);
        this.f12793a.V1(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzs() {
        return this.f12793a.L();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzt() {
        return this.f12793a.V();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzu() {
        return this.f12793a.b0();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzv() {
        return this.f12793a.c0();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzw() {
        return this.f12793a.d0();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzx() {
        return this.f12793a.g0();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzy() {
        return this.f12793a.j0();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzz() {
        return this.f12793a.l0();
    }
}
