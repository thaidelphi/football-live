package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.startapp.b1;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.ads.banner.banner3d.Banner3DView;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdDetails;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h0 implements b1.b, Parcelable {
    public static final Parcelable.Creator<h0> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final AdDetails f22001a;

    /* renamed from: b  reason: collision with root package name */
    public Point f22002b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f22003c;

    /* renamed from: d  reason: collision with root package name */
    public Bitmap f22004d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f22005e;

    /* renamed from: f  reason: collision with root package name */
    public final TrackingParams f22006f;

    /* renamed from: g  reason: collision with root package name */
    public s7 f22007g;

    /* renamed from: h  reason: collision with root package name */
    public Banner3DView f22008h;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Parcelable.Creator<h0> {
        @Override // android.os.Parcelable.Creator
        public final h0 createFromParcel(Parcel parcel) {
            return new h0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final h0[] newArray(int i10) {
            return new h0[i10];
        }
    }

    public h0(Context context, ViewGroup viewGroup, AdDetails adDetails, BannerOptions bannerOptions, TrackingParams trackingParams) {
        this.f22003c = null;
        this.f22004d = null;
        this.f22005e = new AtomicBoolean(false);
        this.f22007g = null;
        this.f22008h = null;
        this.f22001a = adDetails;
        this.f22006f = trackingParams;
        a(context, bannerOptions, viewGroup);
    }

    public final void a(Context context, BannerOptions bannerOptions, ViewGroup viewGroup) {
        Bitmap a10;
        Point point;
        int i10;
        int i11;
        int round = Math.round(TypedValue.applyDimension(1, bannerOptions.d() - 5, context.getResources().getDisplayMetrics()));
        this.f22002b = new Point((int) (bannerOptions.p() * Math.round(TypedValue.applyDimension(1, bannerOptions.o(), context.getResources().getDisplayMetrics()))), (int) (bannerOptions.e() * Math.round(TypedValue.applyDimension(1, bannerOptions.d(), context.getResources().getDisplayMetrics()))));
        Banner3DView banner3DView = new Banner3DView(context, new Point(bannerOptions.o(), bannerOptions.d()));
        this.f22008h = banner3DView;
        banner3DView.setText(this.f22001a.v());
        this.f22008h.setRating(this.f22001a.s());
        this.f22008h.setDescription(this.f22001a.j());
        this.f22008h.setButtonText(this.f22001a.A());
        Bitmap bitmap = this.f22003c;
        if (bitmap != null) {
            this.f22008h.setImage(bitmap, round, round);
        } else {
            this.f22008h.setImage(17301651, round, round);
            new b1(context, this.f22001a.k(), this, 0).a();
        }
        Point point2 = this.f22002b;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(point2.x, point2.y);
        layoutParams.addRule(13);
        viewGroup.addView(this.f22008h, layoutParams);
        this.f22008h.setVisibility(8);
        Banner3DView banner3DView2 = this.f22008h;
        if (banner3DView2 != null) {
            try {
                a10 = a(banner3DView2);
            } catch (OutOfMemoryError unused) {
            } catch (Throwable th) {
                l3.a(th);
            }
            this.f22004d = a10;
            if (a10 == null && (i10 = (point = this.f22002b).x) > 0 && (i11 = point.y) > 0) {
                this.f22004d = Bitmap.createScaledBitmap(a10, i10, i11, false);
            }
            return;
        }
        a10 = null;
        this.f22004d = a10;
        if (a10 == null) {
            return;
        }
        this.f22004d = Bitmap.createScaledBitmap(a10, i10, i11, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f22001a, i10);
        parcel.writeInt(this.f22002b.x);
        parcel.writeInt(this.f22002b.y);
        parcel.writeParcelable(this.f22003c, i10);
        parcel.writeBooleanArray(new boolean[]{this.f22005e.get()});
        parcel.writeSerializable(this.f22006f);
    }

    public h0(Parcel parcel) {
        this.f22003c = null;
        this.f22004d = null;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f22005e = atomicBoolean;
        this.f22007g = null;
        this.f22008h = null;
        this.f22001a = (AdDetails) parcel.readParcelable(AdDetails.class.getClassLoader());
        Point point = new Point(1, 1);
        this.f22002b = point;
        point.x = parcel.readInt();
        this.f22002b.y = parcel.readInt();
        this.f22003c = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        atomicBoolean.set(zArr[0]);
        this.f22006f = (TrackingParams) parcel.readSerializable();
    }

    public static Bitmap a(Banner3DView banner3DView) {
        banner3DView.measure(banner3DView.getMeasuredWidth(), banner3DView.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(banner3DView.getMeasuredWidth(), banner3DView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        banner3DView.layout(0, 0, banner3DView.getMeasuredWidth(), banner3DView.getMeasuredHeight());
        banner3DView.draw(canvas);
        return createBitmap;
    }

    @Override // com.startapp.b1.b
    public final void a(Bitmap bitmap, int i10) {
        Banner3DView banner3DView;
        Bitmap a10;
        Point point;
        int i11;
        int i12;
        if (bitmap == null || (banner3DView = this.f22008h) == null) {
            return;
        }
        this.f22003c = bitmap;
        banner3DView.setImage(bitmap);
        Banner3DView banner3DView2 = this.f22008h;
        if (banner3DView2 != null) {
            try {
                a10 = a(banner3DView2);
            } catch (OutOfMemoryError unused) {
            } catch (Throwable th) {
                l3.a(th);
            }
            this.f22004d = a10;
            if (a10 == null && (i11 = (point = this.f22002b).x) > 0 && (i12 = point.y) > 0) {
                this.f22004d = Bitmap.createScaledBitmap(a10, i11, i12, false);
            }
            return;
        }
        a10 = null;
        this.f22004d = a10;
        if (a10 == null) {
            return;
        }
        this.f22004d = Bitmap.createScaledBitmap(a10, i11, i12, false);
    }
}
