package com.google.gson.internal.bind;

import b7.e;
import b7.r;
import b7.t;
import b7.u;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class TimeTypeAdapter extends t<Time> {

    /* renamed from: b  reason: collision with root package name */
    public static final u f15148b = new u() { // from class: com.google.gson.internal.bind.TimeTypeAdapter.1
        @Override // b7.u
        public <T> t<T> c(e eVar, g7.a<T> aVar) {
            if (aVar.c() == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f15149a = new SimpleDateFormat("hh:mm:ss a");

    @Override // b7.t
    /* renamed from: e */
    public synchronized Time b(h7.a aVar) throws IOException {
        if (aVar.C0() == h7.b.NULL) {
            aVar.n0();
            return null;
        }
        try {
            return new Time(this.f15149a.parse(aVar.y0()).getTime());
        } catch (ParseException e8) {
            throw new r(e8);
        }
    }

    @Override // b7.t
    /* renamed from: f */
    public synchronized void d(h7.c cVar, Time time) throws IOException {
        cVar.H0(time == null ? null : this.f15149a.format((Date) time));
    }
}
