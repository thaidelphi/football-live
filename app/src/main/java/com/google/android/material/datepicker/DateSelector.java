package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface DateSelector<S> extends Parcelable {
    Collection<androidx.core.util.e<Long, Long>> F();

    View G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, k<S> kVar);

    boolean K();

    Collection<Long> L();

    S P();

    void S(long j10);

    int f(Context context);

    String k(Context context);
}
