package f2;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
/* compiled from: ParcelFileDescriptorBitmapDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class v implements w1.j<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final m f25373a;

    public v(m mVar) {
        this.f25373a = mVar;
    }

    @Override // w1.j
    /* renamed from: c */
    public y1.v<Bitmap> a(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, w1.h hVar) throws IOException {
        return this.f25373a.d(parcelFileDescriptor, i10, i11, hVar);
    }

    @Override // w1.j
    /* renamed from: d */
    public boolean b(ParcelFileDescriptor parcelFileDescriptor, w1.h hVar) {
        return this.f25373a.o(parcelFileDescriptor);
    }
}
