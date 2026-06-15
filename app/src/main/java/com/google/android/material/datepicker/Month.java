package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Calendar f14138a;

    /* renamed from: b  reason: collision with root package name */
    final int f14139b;

    /* renamed from: c  reason: collision with root package name */
    final int f14140c;

    /* renamed from: d  reason: collision with root package name */
    final int f14141d;

    /* renamed from: e  reason: collision with root package name */
    final int f14142e;

    /* renamed from: f  reason: collision with root package name */
    final long f14143f;

    /* renamed from: g  reason: collision with root package name */
    private String f14144g;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements Parcelable.Creator<Month> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Month createFromParcel(Parcel parcel) {
            return Month.b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Month[] newArray(int i10) {
            return new Month[i10];
        }
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d10 = o.d(calendar);
        this.f14138a = d10;
        this.f14139b = d10.get(2);
        this.f14140c = d10.get(1);
        this.f14141d = d10.getMaximum(7);
        this.f14142e = d10.getActualMaximum(5);
        this.f14143f = d10.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Month b(int i10, int i11) {
        Calendar k10 = o.k();
        k10.set(1, i10);
        k10.set(2, i11);
        return new Month(k10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Month c(long j10) {
        Calendar k10 = o.k();
        k10.setTimeInMillis(j10);
        return new Month(k10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Month d() {
        return new Month(o.i());
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(Month month) {
        return this.f14138a.compareTo(month.f14138a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Month) {
            Month month = (Month) obj;
            return this.f14139b == month.f14139b && this.f14140c == month.f14140c;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        int firstDayOfWeek = this.f14138a.get(7) - this.f14138a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f14141d : firstDayOfWeek;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long h(int i10) {
        Calendar d10 = o.d(this.f14138a);
        d10.set(5, i10);
        return d10.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14139b), Integer.valueOf(this.f14140c)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i(long j10) {
        Calendar d10 = o.d(this.f14138a);
        d10.setTimeInMillis(j10);
        return d10.get(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String l() {
        if (this.f14144g == null) {
            this.f14144g = c.c(this.f14138a.getTimeInMillis());
        }
        return this.f14144g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long m() {
        return this.f14138a.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month n(int i10) {
        Calendar d10 = o.d(this.f14138a);
        d10.add(2, i10);
        return new Month(d10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o(Month month) {
        if (this.f14138a instanceof GregorianCalendar) {
            return ((month.f14140c - this.f14140c) * 12) + (month.f14139b - this.f14139b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14140c);
        parcel.writeInt(this.f14139b);
    }
}
