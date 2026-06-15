package com.google.gson.internal.bind;

import b7.e;
import b7.r;
import b7.t;
import b7.u;
import d7.h;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class DateTypeAdapter extends t<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final u f15117b = new u() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // b7.u
        public <T> t<T> c(e eVar, g7.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final List<DateFormat> f15118a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f15118a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (i7.a.c()) {
            arrayList.add(h.c(2, 2));
        }
    }

    private synchronized Date e(String str) {
        for (DateFormat dateFormat : this.f15118a) {
            try {
                return dateFormat.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return e7.a.c(str, new ParsePosition(0));
        } catch (ParseException e8) {
            throw new r(str, e8);
        }
    }

    @Override // b7.t
    /* renamed from: f */
    public Date b(h7.a aVar) throws IOException {
        if (aVar.C0() == h7.b.NULL) {
            aVar.n0();
            return null;
        }
        return e(aVar.y0());
    }

    @Override // b7.t
    /* renamed from: g */
    public synchronized void d(h7.c cVar, Date date) throws IOException {
        if (date == null) {
            cVar.K();
        } else {
            cVar.H0(this.f15118a.get(0).format(date));
        }
    }
}
