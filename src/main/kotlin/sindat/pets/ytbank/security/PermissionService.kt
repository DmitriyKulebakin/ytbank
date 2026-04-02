package sindat.pets.ytbank.security

import org.springframework.dao.PermissionDeniedDataAccessException
import org.springframework.stereotype.Service
import sindat.pets.ytbank.exceptionsHandler.exceptions.AccessDeniedException
import sindat.pets.ytbank.users.UserEntity
import sindat.pets.ytbank.users.obj.Permission

@Service
class PermissionService(private val permissionComparator: Comparator<Permission>) {

    @Throws(PermissionDeniedDataAccessException::class)
    fun authorizePermissionBase(userToCheck: UserEntity) {
        if (permissionComparator.compare(userToCheck.permissionLevel, Permission.BASE) < 0) {
            throw AccessDeniedException()
        }
    }
}