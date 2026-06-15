package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IFragmentWrapper;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
@SuppressLint({"NewApi"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class FragmentWrapper extends IFragmentWrapper.Stub {

    /* renamed from: a  reason: collision with root package name */
    private final Fragment f12791a;

    private FragmentWrapper(Fragment fragment) {
        this.f12791a = fragment;
    }

    @KeepForSdk
    public static FragmentWrapper Z(Fragment fragment) {
        if (fragment != null) {
            return new FragmentWrapper(fragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void G(boolean z10) {
        this.f12791a.setMenuVisibility(z10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void R(Intent intent) {
        this.f12791a.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void T(Intent intent, int i10) {
        this.f12791a.startActivityForResult(intent, i10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void m0(boolean z10) {
        this.f12791a.setUserVisibleHint(z10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzA() {
        return this.f12791a.isVisible();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzb() {
        return this.f12791a.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzc() {
        return this.f12791a.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final Bundle zzd() {
        return this.f12791a.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zze() {
        return Z(this.f12791a.getParentFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zzf() {
        return Z(this.f12791a.getTargetFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper zzg() {
        return ObjectWrapper.u0(this.f12791a.getActivity());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper zzh() {
        return ObjectWrapper.u0(this.f12791a.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper zzi() {
        return ObjectWrapper.u0(this.f12791a.getView());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final String zzj() {
        return this.f12791a.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzk(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.t0(iObjectWrapper);
        Preconditions.m(view);
        this.f12791a.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzl(boolean z10) {
        this.f12791a.setHasOptionsMenu(z10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzn(boolean z10) {
        this.f12791a.setRetainInstance(z10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzr(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.t0(iObjectWrapper);
        Preconditions.m(view);
        this.f12791a.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzs() {
        return this.f12791a.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzt() {
        return this.f12791a.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzu() {
        return this.f12791a.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzv() {
        return this.f12791a.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzw() {
        return this.f12791a.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzx() {
        return this.f12791a.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzy() {
        return this.f12791a.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzz() {
        return this.f12791a.isResumed();
    }
}
