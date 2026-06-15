package com.ironsource.mediationsdk.metadata;

import android.text.TextUtils;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.metadata.MetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MetaDataUtils {
    public static String checkMetaDataKeyValidity(String str) {
        return (str == null || str.length() > 2048) ? "The MetaData key you entered is invalid. Please enter a key of maximum 2048 characters." : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String checkMetaDataValueValidity(java.util.List<java.lang.String> r2) {
        /*
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r2 = "The MetaData list should include at least one element."
            return r2
        L9:
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L23
            int r0 = r0.length()
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 <= r1) goto Ld
        L23:
            java.lang.String r2 = "The MetaData value(s) you entered is invalid. Please enter a value of maximum 2048 characters."
            return r2
        L26:
            java.lang.String r2 = ""
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.metadata.MetaDataUtils.checkMetaDataValueValidity(java.util.List):java.lang.String");
    }

    public static MetaData formatMetaData(String str, List<String> list) {
        if (isKnownKey(str)) {
            String lowerCase = StringUtils.toLowerCase(str);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : list) {
                MetaData.MetaDataValueTypes valueTypeForKey = getValueTypeForKey(lowerCase);
                String formatValueForType = formatValueForType(str2, valueTypeForKey);
                arrayList.add(valueTypeForKey);
                arrayList2.add(formatValueForType);
            }
            return new MetaData(lowerCase, arrayList2, arrayList);
        }
        return new MetaData(str, list);
    }

    public static String formatValueForType(String str, MetaData.MetaDataValueTypes metaDataValueTypes) {
        return metaDataValueTypes == MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN ? (str.equalsIgnoreCase(a.f18924g) || str.equalsIgnoreCase("yes")) ? a.f18924g : (str.equalsIgnoreCase("false") || str.equalsIgnoreCase("no")) ? "false" : "" : str;
    }

    public static boolean getMetaDataBooleanValue(String str) {
        return !str.equals("false");
    }

    public static MetaData.MetaDataValueTypes getValueTypeForKey(String str) {
        return (str.equalsIgnoreCase(a.f18918a) || str.equalsIgnoreCase(a.f18919b) || str.equalsIgnoreCase(a.f18920c) || str.equalsIgnoreCase(a.f18921d)) ? MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN : MetaData.MetaDataValueTypes.META_DATA_VALUE_STRING;
    }

    public static boolean isKnownKey(String str) {
        return a.f18930m.contains(str.toLowerCase(Locale.getDefault()));
    }

    public static boolean isMediationKeysBeforeInit(String str) {
        return a.f18929l.contains(str.toLowerCase(Locale.getDefault()));
    }

    public static boolean isMediationOnlyKey(String str) {
        return a.f18928k.contains(str.toLowerCase(Locale.getDefault()));
    }

    public static boolean isValidCCPAMetaData(String str, String str2) {
        return isValidMetaData(str, a.f18918a, str2);
    }

    public static boolean isValidMetaData(String str, String str2, String str3) {
        return str.equalsIgnoreCase(str2) && !TextUtils.isEmpty(str3);
    }
}
