package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@ShowFirstParty
@KeepForSdk
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new zaa();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f12410a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    ParcelFileDescriptor f12411b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    final int f12412c;

    /* renamed from: d  reason: collision with root package name */
    private Bitmap f12413d = null;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12414e = false;

    /* renamed from: f  reason: collision with root package name */
    private File f12415f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public BitmapTeleporter(@SafeParcelable.Param int i10, @SafeParcelable.Param ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param int i11) {
        this.f12410a = i10;
        this.f12411b = parcelFileDescriptor;
        this.f12412c = i11;
    }

    private static final void X(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e8) {
            Log.w("BitmapTeleporter", "Could not close stream", e8);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        if (this.f12411b == null) {
            Bitmap bitmap = (Bitmap) Preconditions.m(this.f12413d);
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            File file = this.f12415f;
            if (file != null) {
                try {
                    File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        this.f12411b = ParcelFileDescriptor.open(createTempFile, 268435456);
                        createTempFile.delete();
                        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                        try {
                            try {
                                dataOutputStream.writeInt(array.length);
                                dataOutputStream.writeInt(bitmap.getWidth());
                                dataOutputStream.writeInt(bitmap.getHeight());
                                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                                dataOutputStream.write(array);
                            } catch (IOException e8) {
                                throw new IllegalStateException("Could not write into unlinked file", e8);
                            }
                        } finally {
                            X(dataOutputStream);
                        }
                    } catch (FileNotFoundException unused) {
                        throw new IllegalStateException("Temporary file is somehow already deleted");
                    }
                } catch (IOException e10) {
                    throw new IllegalStateException("Could not create temporary file", e10);
                }
            } else {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
        }
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f12410a);
        SafeParcelWriter.q(parcel, 2, this.f12411b, i10 | 1, false);
        SafeParcelWriter.k(parcel, 3, this.f12412c);
        SafeParcelWriter.b(parcel, a10);
        this.f12411b = null;
    }
}
