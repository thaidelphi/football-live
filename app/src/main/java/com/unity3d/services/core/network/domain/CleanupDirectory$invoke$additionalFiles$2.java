package com.unity3d.services.core.network.domain;

import i8.n;
import i8.s;
import j8.y;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;
import t8.p;
/* compiled from: CleanupDirectory.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class CleanupDirectory$invoke$additionalFiles$2 extends o implements p<n<? extends Long, ? extends List<? extends File>>, File, n<? extends Long, ? extends List<? extends File>>> {
    public static final CleanupDirectory$invoke$additionalFiles$2 INSTANCE = new CleanupDirectory$invoke$additionalFiles$2();

    CleanupDirectory$invoke$additionalFiles$2() {
        super(2);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final n<Long, List<File>> invoke2(n<Long, ? extends List<? extends File>> nVar, File file) {
        List F;
        kotlin.jvm.internal.n.f(nVar, "<name for destructuring parameter 0>");
        kotlin.jvm.internal.n.f(file, "file");
        Long valueOf = Long.valueOf(nVar.a().longValue() - file.length());
        F = y.F(nVar.b(), file);
        return s.a(valueOf, F);
    }

    @Override // t8.p
    public /* bridge */ /* synthetic */ n<? extends Long, ? extends List<? extends File>> invoke(n<? extends Long, ? extends List<? extends File>> nVar, File file) {
        return invoke2((n<Long, ? extends List<? extends File>>) nVar, file);
    }
}
