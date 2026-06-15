package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: IntentSenderRequest.kt */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class IntentSenderRequest implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    private final IntentSender f788a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f789b;

    /* renamed from: c  reason: collision with root package name */
    private final int f790c;

    /* renamed from: d  reason: collision with root package name */
    private final int f791d;

    /* renamed from: e  reason: collision with root package name */
    public static final c f787e = new c(null);
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new b();

    /* compiled from: IntentSenderRequest.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final IntentSender f792a;

        /* renamed from: b  reason: collision with root package name */
        private Intent f793b;

        /* renamed from: c  reason: collision with root package name */
        private int f794c;

        /* renamed from: d  reason: collision with root package name */
        private int f795d;

        public a(IntentSender intentSender) {
            n.f(intentSender, "intentSender");
            this.f792a = intentSender;
        }

        public final IntentSenderRequest a() {
            return new IntentSenderRequest(this.f792a, this.f793b, this.f794c, this.f795d);
        }

        public final a b(Intent intent) {
            this.f793b = intent;
            return this;
        }

        public final a c(int i10, int i11) {
            this.f795d = i10;
            this.f794c = i11;
            return this;
        }
    }

    /* compiled from: IntentSenderRequest.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b implements Parcelable.Creator<IntentSenderRequest> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public IntentSenderRequest createFromParcel(Parcel inParcel) {
            n.f(inParcel, "inParcel");
            return new IntentSenderRequest(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public IntentSenderRequest[] newArray(int i10) {
            return new IntentSenderRequest[i10];
        }
    }

    /* compiled from: IntentSenderRequest.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(h hVar) {
            this();
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i10, int i11) {
        n.f(intentSender, "intentSender");
        this.f788a = intentSender;
        this.f789b = intent;
        this.f790c = i10;
        this.f791d = i11;
    }

    public final Intent a() {
        return this.f789b;
    }

    public final int b() {
        return this.f790c;
    }

    public final int c() {
        return this.f791d;
    }

    public final IntentSender d() {
        return this.f788a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        n.f(dest, "dest");
        dest.writeParcelable(this.f788a, i10);
        dest.writeParcelable(this.f789b, i10);
        dest.writeInt(this.f790c);
        dest.writeInt(this.f791d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IntentSenderRequest(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.n.f(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            kotlin.jvm.internal.n.c(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.IntentSenderRequest.<init>(android.os.Parcel):void");
    }
}
