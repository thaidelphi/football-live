package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Month f14122a;

    /* renamed from: b  reason: collision with root package name */
    private final Month f14123b;

    /* renamed from: c  reason: collision with root package name */
    private final DateValidator f14124c;

    /* renamed from: d  reason: collision with root package name */
    private Month f14125d;

    /* renamed from: e  reason: collision with root package name */
    private final int f14126e;

    /* renamed from: f  reason: collision with root package name */
    private final int f14127f;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface DateValidator extends Parcelable {
        boolean j(long j10);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements Parcelable.Creator<CalendarConstraints> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CalendarConstraints[] newArray(int i10) {
            return new CalendarConstraints[i10];
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        static final long f14128e = o.a(Month.b(1900, 0).f14143f);

        /* renamed from: f  reason: collision with root package name */
        static final long f14129f = o.a(Month.b(2100, 11).f14143f);

        /* renamed from: a  reason: collision with root package name */
        private long f14130a;

        /* renamed from: b  reason: collision with root package name */
        private long f14131b;

        /* renamed from: c  reason: collision with root package name */
        private Long f14132c;

        /* renamed from: d  reason: collision with root package name */
        private DateValidator f14133d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(CalendarConstraints calendarConstraints) {
            this.f14130a = f14128e;
            this.f14131b = f14129f;
            this.f14133d = DateValidatorPointForward.a(Long.MIN_VALUE);
            this.f14130a = calendarConstraints.f14122a.f14143f;
            this.f14131b = calendarConstraints.f14123b.f14143f;
            this.f14132c = Long.valueOf(calendarConstraints.f14125d.f14143f);
            this.f14133d = calendarConstraints.f14124c;
        }

        public CalendarConstraints a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f14133d);
            Month c10 = Month.c(this.f14130a);
            Month c11 = Month.c(this.f14131b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f14132c;
            return new CalendarConstraints(c10, c11, dateValidator, l10 == null ? null : Month.c(l10.longValue()), null);
        }

        public b b(long j10) {
            this.f14132c = Long.valueOf(j10);
            return this;
        }
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, a aVar) {
        this(month, month2, dateValidator, month3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month e(Month month) {
        if (month.compareTo(this.f14122a) < 0) {
            return this.f14122a;
        }
        return month.compareTo(this.f14123b) > 0 ? this.f14123b : month;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CalendarConstraints) {
            CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
            return this.f14122a.equals(calendarConstraints.f14122a) && this.f14123b.equals(calendarConstraints.f14123b) && androidx.core.util.d.a(this.f14125d, calendarConstraints.f14125d) && this.f14124c.equals(calendarConstraints.f14124c);
        }
        return false;
    }

    public DateValidator g() {
        return this.f14124c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month h() {
        return this.f14123b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14122a, this.f14123b, this.f14125d, this.f14124c});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.f14127f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month l() {
        return this.f14125d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month m() {
        return this.f14122a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.f14126e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f14122a, 0);
        parcel.writeParcelable(this.f14123b, 0);
        parcel.writeParcelable(this.f14125d, 0);
        parcel.writeParcelable(this.f14124c, 0);
    }

    private CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3) {
        this.f14122a = month;
        this.f14123b = month2;
        this.f14125d = month3;
        this.f14124c = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f14127f = month.o(month2) + 1;
        this.f14126e = (month2.f14140c - month.f14140c) + 1;
    }
}
