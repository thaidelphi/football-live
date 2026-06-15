package l1;

import android.os.Build;
import androidx.work.d;
import androidx.work.z;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
/* compiled from: WorkTypeConverters.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class v {

    /* compiled from: WorkTypeConverters.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27482a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f27483b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f27484c;

        /* renamed from: d  reason: collision with root package name */
        static final /* synthetic */ int[] f27485d;

        static {
            int[] iArr = new int[androidx.work.t.values().length];
            f27485d = iArr;
            try {
                iArr[androidx.work.t.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27485d[androidx.work.t.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[androidx.work.q.values().length];
            f27484c = iArr2;
            try {
                iArr2[androidx.work.q.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27484c[androidx.work.q.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27484c[androidx.work.q.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27484c[androidx.work.q.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27484c[androidx.work.q.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[androidx.work.a.values().length];
            f27483b = iArr3;
            try {
                iArr3[androidx.work.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27483b[androidx.work.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[z.a.values().length];
            f27482a = iArr4;
            try {
                iArr4[z.a.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f27482a[z.a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f27482a[z.a.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f27482a[z.a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f27482a[z.a.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f27482a[z.a.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static int a(androidx.work.a aVar) {
        int i10 = a.f27483b[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return 1;
            }
            throw new IllegalArgumentException("Could not convert " + aVar + " to int");
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0053 -> B:33:0x0056). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.work.d b(byte[] r6) {
        /*
            androidx.work.d r0 = new androidx.work.d
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            int r6 = r2.readInt()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
        L17:
            if (r6 <= 0) goto L2b
            java.lang.String r3 = r2.readUTF()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            boolean r4 = r2.readBoolean()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            r0.a(r3, r4)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            int r6 = r6 + (-1)
            goto L17
        L2b:
            r2.close()     // Catch: java.io.IOException -> L2f
            goto L33
        L2f:
            r6 = move-exception
            r6.printStackTrace()
        L33:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L37:
            r6 = move-exception
            goto L41
        L39:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L58
        L3d:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L41:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L4e
            r2.close()     // Catch: java.io.IOException -> L4a
            goto L4e
        L4a:
            r6 = move-exception
            r6.printStackTrace()
        L4e:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L52:
            r6 = move-exception
            r6.printStackTrace()
        L56:
            return r0
        L57:
            r6 = move-exception
        L58:
            if (r2 == 0) goto L62
            r2.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r0 = move-exception
            r0.printStackTrace()
        L62:
            r1.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.v.b(byte[]):androidx.work.d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0067 -> B:35:0x006a). Please submit an issue!!! */
    public static byte[] c(androidx.work.d dVar) {
        ObjectOutputStream objectOutputStream;
        boolean hasNext;
        ObjectOutputStream objectOutputStream2 = null;
        ObjectOutputStream objectOutputStream3 = null;
        objectOutputStream2 = null;
        if (dVar.c() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e8) {
                e = e8;
            }
        } catch (IOException e10) {
            e10.printStackTrace();
            objectOutputStream2 = objectOutputStream2;
        }
        try {
            objectOutputStream.writeInt(dVar.c());
            Iterator<d.a> it = dVar.b().iterator();
            while (true) {
                hasNext = it.hasNext();
                if (hasNext != 0) {
                    d.a next = it.next();
                    objectOutputStream.writeUTF(next.a().toString());
                    objectOutputStream.writeBoolean(next.b());
                } else {
                    try {
                        break;
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
            }
            objectOutputStream.close();
            byteArrayOutputStream.close();
            objectOutputStream2 = hasNext;
        } catch (IOException e12) {
            e = e12;
            objectOutputStream3 = objectOutputStream;
            e.printStackTrace();
            if (objectOutputStream3 != null) {
                try {
                    objectOutputStream3.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            }
            byteArrayOutputStream.close();
            objectOutputStream2 = objectOutputStream3;
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e15) {
                e15.printStackTrace();
            }
            throw th;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static androidx.work.a d(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return androidx.work.a.LINEAR;
            }
            throw new IllegalArgumentException("Could not convert " + i10 + " to BackoffPolicy");
        }
        return androidx.work.a.EXPONENTIAL;
    }

    public static androidx.work.q e(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
                                return androidx.work.q.TEMPORARILY_UNMETERED;
                            }
                            throw new IllegalArgumentException("Could not convert " + i10 + " to NetworkType");
                        }
                        return androidx.work.q.METERED;
                    }
                    return androidx.work.q.NOT_ROAMING;
                }
                return androidx.work.q.UNMETERED;
            }
            return androidx.work.q.CONNECTED;
        }
        return androidx.work.q.NOT_REQUIRED;
    }

    public static androidx.work.t f(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return androidx.work.t.DROP_WORK_REQUEST;
            }
            throw new IllegalArgumentException("Could not convert " + i10 + " to OutOfQuotaPolicy");
        }
        return androidx.work.t.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    }

    public static z.a g(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                return z.a.CANCELLED;
                            }
                            throw new IllegalArgumentException("Could not convert " + i10 + " to State");
                        }
                        return z.a.BLOCKED;
                    }
                    return z.a.FAILED;
                }
                return z.a.SUCCEEDED;
            }
            return z.a.RUNNING;
        }
        return z.a.ENQUEUED;
    }

    public static int h(androidx.work.q qVar) {
        int i10 = a.f27484c[qVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (Build.VERSION.SDK_INT < 30 || qVar != androidx.work.q.TEMPORARILY_UNMETERED) {
                                throw new IllegalArgumentException("Could not convert " + qVar + " to int");
                            }
                            return 5;
                        }
                        return 4;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static int i(androidx.work.t tVar) {
        int i10 = a.f27485d[tVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return 1;
            }
            throw new IllegalArgumentException("Could not convert " + tVar + " to int");
        }
        return 0;
    }

    public static int j(z.a aVar) {
        switch (a.f27482a[aVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + aVar + " to int");
        }
    }
}
