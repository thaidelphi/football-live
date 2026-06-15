package com.google.android.gms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class CursorWrapper extends android.database.CursorWrapper implements CrossProcessCursor {

    /* renamed from: a  reason: collision with root package name */
    private AbstractWindowedCursor f12710a;

    @Override // android.database.CrossProcessCursor
    @KeepForSdk
    public void fillWindow(int i10, CursorWindow cursorWindow) {
        this.f12710a.fillWindow(i10, cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public CursorWindow getWindow() {
        return this.f12710a.getWindow();
    }

    @Override // android.database.CursorWrapper
    public final /* synthetic */ Cursor getWrappedCursor() {
        return this.f12710a;
    }

    @Override // android.database.CrossProcessCursor
    @ResultIgnorabilityUnspecified
    public final boolean onMove(int i10, int i11) {
        return this.f12710a.onMove(i10, i11);
    }
}
