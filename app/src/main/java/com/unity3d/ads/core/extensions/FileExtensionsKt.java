package com.unity3d.ads.core.extensions;

import java.io.File;
import java.util.LinkedList;
import kotlin.jvm.internal.n;
/* compiled from: FileExtensions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class FileExtensionsKt {
    public static final long getDirectorySize(File file) {
        File[] listFiles;
        n.f(file, "<this>");
        long j10 = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(file);
        while (true) {
            if (!(!linkedList.isEmpty())) {
                return j10;
            }
            File file2 = (File) linkedList.remove(0);
            if (file2.exists() && (listFiles = file2.listFiles()) != null) {
                if (!(listFiles.length == 0)) {
                    for (File child : listFiles) {
                        if (child.isDirectory()) {
                            n.e(child, "child");
                            linkedList.add(child);
                        } else {
                            j10 += child.length();
                        }
                    }
                }
            }
        }
    }
}
