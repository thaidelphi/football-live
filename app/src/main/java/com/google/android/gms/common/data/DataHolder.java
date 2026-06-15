package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
@KeepName
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();

    /* renamed from: k  reason: collision with root package name */
    private static final Builder f12424k = new a(new String[0], null);
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f12425a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final String[] f12426b;

    /* renamed from: c  reason: collision with root package name */
    Bundle f12427c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final CursorWindow[] f12428d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final int f12429e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f12430f;

    /* renamed from: g  reason: collision with root package name */
    int[] f12431g;

    /* renamed from: h  reason: collision with root package name */
    int f12432h;

    /* renamed from: i  reason: collision with root package name */
    boolean f12433i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f12434j = true;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private final String[] f12435a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<HashMap<String, Object>> f12436b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        private final HashMap<Object, Integer> f12437c = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public DataHolder(@SafeParcelable.Param int i10, @SafeParcelable.Param String[] strArr, @SafeParcelable.Param CursorWindow[] cursorWindowArr, @SafeParcelable.Param int i11, @SafeParcelable.Param Bundle bundle) {
        this.f12425a = i10;
        this.f12426b = strArr;
        this.f12428d = cursorWindowArr;
        this.f12429e = i11;
        this.f12430f = bundle;
    }

    private final void D0(String str, int i10) {
        Bundle bundle = this.f12427c;
        if (bundle != null && bundle.containsKey(str)) {
            if (!isClosed()) {
                if (i10 < 0 || i10 >= this.f12432h) {
                    throw new CursorIndexOutOfBoundsException(i10, this.f12432h);
                }
                return;
            }
            throw new IllegalArgumentException("Buffer is closed.");
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? "No such column: ".concat(valueOf) : new String("No such column: "));
    }

    public final void C0() {
        this.f12427c = new Bundle();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = this.f12426b;
            if (i11 >= strArr.length) {
                break;
            }
            this.f12427c.putInt(strArr[i11], i11);
            i11++;
        }
        this.f12431g = new int[this.f12428d.length];
        int i12 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f12428d;
            if (i10 >= cursorWindowArr.length) {
                this.f12432h = i12;
                return;
            }
            this.f12431g[i10] = i12;
            i12 += this.f12428d[i10].getNumRows() - (i12 - cursorWindowArr[i10].getStartPosition());
            i10++;
        }
    }

    @KeepForSdk
    public byte[] X(String str, int i10, int i11) {
        D0(str, i10);
        return this.f12428d[i11].getBlob(i10, this.f12427c.getInt(str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public void close() {
        synchronized (this) {
            if (!this.f12433i) {
                this.f12433i = true;
                int i10 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f12428d;
                    if (i10 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i10].close();
                    i10++;
                }
            }
        }
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.f12434j && this.f12428d.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public int getCount() {
        return this.f12432h;
    }

    @KeepForSdk
    public boolean isClosed() {
        boolean z10;
        synchronized (this) {
            z10 = this.f12433i;
        }
        return z10;
    }

    @KeepForSdk
    public Bundle n0() {
        return this.f12430f;
    }

    @KeepForSdk
    public int o0() {
        return this.f12429e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.s(parcel, 1, this.f12426b, false);
        SafeParcelWriter.u(parcel, 2, this.f12428d, i10, false);
        SafeParcelWriter.k(parcel, 3, o0());
        SafeParcelWriter.e(parcel, 4, n0(), false);
        SafeParcelWriter.k(parcel, 1000, this.f12425a);
        SafeParcelWriter.b(parcel, a10);
        if ((i10 & 1) != 0) {
            close();
        }
    }

    @KeepForSdk
    public String y0(String str, int i10, int i11) {
        D0(str, i10);
        return this.f12428d[i11].getString(i10, this.f12427c.getInt(str));
    }

    @KeepForSdk
    public int z0(int i10) {
        int length;
        int i11 = 0;
        Preconditions.p(i10 >= 0 && i10 < this.f12432h);
        while (true) {
            int[] iArr = this.f12431g;
            length = iArr.length;
            if (i11 >= length) {
                break;
            } else if (i10 < iArr[i11]) {
                i11--;
                break;
            } else {
                i11++;
            }
        }
        return i11 == length ? i11 - 1 : i11;
    }
}
