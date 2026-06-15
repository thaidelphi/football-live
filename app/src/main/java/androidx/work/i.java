package androidx.work;

import android.app.Notification;
/* compiled from: ForegroundInfo.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final int f4658a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4659b;

    /* renamed from: c  reason: collision with root package name */
    private final Notification f4660c;

    public i(int i10, Notification notification, int i11) {
        this.f4658a = i10;
        this.f4660c = notification;
        this.f4659b = i11;
    }

    public int a() {
        return this.f4659b;
    }

    public Notification b() {
        return this.f4660c;
    }

    public int c() {
        return this.f4658a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f4658a == iVar.f4658a && this.f4659b == iVar.f4659b) {
            return this.f4660c.equals(iVar.f4660c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f4658a * 31) + this.f4659b) * 31) + this.f4660c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f4658a + ", mForegroundServiceType=" + this.f4659b + ", mNotification=" + this.f4660c + '}';
    }
}
