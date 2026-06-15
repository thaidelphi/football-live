package b7;

import java.lang.reflect.Field;
import java.util.Locale;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FieldNamingPolicy.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class c implements b7.d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f5238a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f5239b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f5240c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f5241d;

    /* renamed from: e  reason: collision with root package name */
    public static final c f5242e;

    /* renamed from: f  reason: collision with root package name */
    public static final c f5243f;

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ c[] f5244g;

    /* compiled from: FieldNamingPolicy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    enum a extends c {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // b7.d
        public String a(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f5238a = aVar;
        c cVar = new c("UPPER_CAMEL_CASE", 1) { // from class: b7.c.b
            @Override // b7.d
            public String a(Field field) {
                return c.d(field.getName());
            }
        };
        f5239b = cVar;
        c cVar2 = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: b7.c.c
            @Override // b7.d
            public String a(Field field) {
                return c.d(c.c(field.getName(), " "));
            }
        };
        f5240c = cVar2;
        c cVar3 = new c("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: b7.c.d
            @Override // b7.d
            public String a(Field field) {
                return c.c(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        f5241d = cVar3;
        c cVar4 = new c("LOWER_CASE_WITH_DASHES", 4) { // from class: b7.c.e
            @Override // b7.d
            public String a(Field field) {
                return c.c(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        f5242e = cVar4;
        c cVar5 = new c("LOWER_CASE_WITH_DOTS", 5) { // from class: b7.c.f
            @Override // b7.d
            public String a(Field field) {
                return c.c(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        f5243f = cVar5;
        f5244g = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5};
    }

    private c(String str, int i10) {
    }

    private static String b(char c10, String str, int i10) {
        if (i10 < str.length()) {
            return c10 + str.substring(i10);
        }
        return String.valueOf(c10);
    }

    static String c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    static String d(String str) {
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i10 < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i10++;
            charAt = str.charAt(i10);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        sb.append(b(Character.toUpperCase(charAt), str, i10 + 1));
        return sb.toString();
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f5244g.clone();
    }

    /* synthetic */ c(String str, int i10, a aVar) {
        this(str, i10);
    }
}
