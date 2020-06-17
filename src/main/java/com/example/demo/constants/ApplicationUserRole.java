package com.example.demo.constants;

import com.google.common.collect.Sets;
import static com.example.demo.constants.AppilcationUserPermission.*;
import java.util.Set;

public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ,COURSE_WRITE,STUDENT_READ,STUDENT_WRITE));

    private final Set<AppilcationUserPermission> permissions;

    ApplicationUserRole(Set<AppilcationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<AppilcationUserPermission> getPermissions() {
        return permissions;
    }
}
