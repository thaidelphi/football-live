package com.google.gson.internal.bind;

import b7.e;
import b7.r;
import b7.t;
import b7.u;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class SqlDateTypeAdapter extends t<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final u f15146b = new u() { // from class: com.google.gson.internal.bind.SqlDateTypeAdapter.1
        @Override // b7.u
        public <T> t<T> c(e eVar, g7.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f15147a = new SimpleDateFormat("MMM d, yyyy");

    @Override // b7.t
    /* renamed from: e */
    public synchronized Date b(h7.a aVar) throws IOException {
        if (aVar.C0() == h7.b.NULL) {
            aVar.n0();
            return null;
        }
        try {
            return new Date(this.f15147a.parse(aVar.y0()).getTime());
        } catch (ParseException e8) {
            throw new r(e8);
        }
    }

    @Override // b7.t
    /* renamed from: f */
    public synchronized void d(h7.c cVar, Date date) throws IOException {
        cVar.H0(date == null ? null : this.f15147a.format((java.util.Date) date));
    }
}
