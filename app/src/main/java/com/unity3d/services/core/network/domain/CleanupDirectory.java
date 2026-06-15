package com.unity3d.services.core.network.domain;

import a9.f;
import i8.s;
import j8.q;
import j8.y;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import l8.b;
import r8.g;
import r8.l;
/* compiled from: CleanupDirectory.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CleanupDirectory {
    public final void invoke(File directory, int i10, long j10) {
        g j11;
        f<File> h10;
        f p10;
        f n10;
        List d10;
        f m7;
        List list;
        boolean z10;
        n.f(directory, "directory");
        if (directory.exists() && directory.isDirectory()) {
            Object obj = null;
            j11 = l.j(directory, null, 1, null);
            h10 = a9.n.h(j11, CleanupDirectory$invoke$cachedFiles$1.INSTANCE);
            long j12 = 0;
            long j13 = 0;
            for (File file : h10) {
                j13 += file.length();
            }
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : h10) {
                if (((File) obj2).lastModified() + j10 < currentTimeMillis) {
                    arrayList.add(obj2);
                } else {
                    arrayList2.add(obj2);
                }
            }
            i8.n nVar = new i8.n(arrayList, arrayList2);
            List<File> list2 = (List) nVar.a();
            List<File> list3 = (List) nVar.b();
            for (File file2 : list2) {
                j12 += file2.length();
            }
            long j14 = j13 - j12;
            for (File file3 : list2) {
                file3.delete();
            }
            long j15 = i10 * 1024 * 1024;
            if (j14 > j15) {
                p10 = y.p(list3);
                n10 = a9.n.n(p10, new Comparator() { // from class: com.unity3d.services.core.network.domain.CleanupDirectory$invoke$$inlined$sortedBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        int a10;
                        a10 = b.a(Long.valueOf(((File) t10).lastModified()), Long.valueOf(((File) t11).lastModified()));
                        return a10;
                    }
                });
                Long valueOf = Long.valueOf(j14);
                d10 = q.d();
                m7 = a9.n.m(n10, s.a(valueOf, d10), CleanupDirectory$invoke$additionalFiles$2.INSTANCE);
                Iterator it = m7.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((Number) ((i8.n) next).a()).longValue() <= j15) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        obj = next;
                        break;
                    }
                }
                i8.n nVar2 = (i8.n) obj;
                if (nVar2 != null && (list = (List) nVar2.b()) != null) {
                    list3 = list;
                }
                for (File file4 : list3) {
                    file4.delete();
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Directory does not exist or is not a directory: " + directory).toString());
    }
}
