package pl.droidsonroids.gif;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class GifViewSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<GifViewSavedState> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final long[][] f29972a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static class a implements Parcelable.Creator<GifViewSavedState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public GifViewSavedState createFromParcel(Parcel parcel) {
            return new GifViewSavedState(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public GifViewSavedState[] newArray(int i10) {
            return new GifViewSavedState[i10];
        }
    }

    /* synthetic */ GifViewSavedState(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Drawable drawable, int i10) {
        long[][] jArr = this.f29972a;
        if (jArr[i10] == null || !(drawable instanceof pl.droidsonroids.gif.a)) {
            return;
        }
        pl.droidsonroids.gif.a aVar = (pl.droidsonroids.gif.a) drawable;
        aVar.i(aVar.f29979g.r(jArr[i10], aVar.f29978f));
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f29972a.length);
        for (long[] jArr : this.f29972a) {
            parcel.writeLongArray(jArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GifViewSavedState(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.f29972a = new long[drawableArr.length];
        for (int i10 = 0; i10 < drawableArr.length; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable instanceof pl.droidsonroids.gif.a) {
                this.f29972a[i10] = ((pl.droidsonroids.gif.a) drawable).f29979g.i();
            } else {
                this.f29972a[i10] = null;
            }
        }
    }

    private GifViewSavedState(Parcel parcel) {
        super(parcel);
        this.f29972a = new long[parcel.readInt()];
        int i10 = 0;
        while (true) {
            long[][] jArr = this.f29972a;
            if (i10 >= jArr.length) {
                return;
            }
            jArr[i10] = parcel.createLongArray();
            i10++;
        }
    }
}
