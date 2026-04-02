package sindat.pets.ytbank.security

import org.springframework.stereotype.Component
import sindat.pets.ytbank.users.obj.Permission

@Component
class PermissionComparator : Comparator<Permission> {
    override fun compare(p0: Permission, p1: Permission) = p0.compareTo(p1)
}