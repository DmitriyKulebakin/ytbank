package sindat.pet_projects.ytbank.security

import org.springframework.stereotype.Component
import sindat.pet_projects.ytbank.users.obj.Permission

@Component
class PermissionComparator : Comparator<Permission> {
    override fun compare(p0: Permission, p1: Permission) = p0.compareTo(p1)
}