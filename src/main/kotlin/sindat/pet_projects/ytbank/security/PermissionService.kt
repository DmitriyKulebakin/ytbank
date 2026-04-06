package sindat.pet_projects.ytbank.security

import org.springframework.dao.PermissionDeniedDataAccessException
import org.springframework.stereotype.Service
import sindat.pet_projects.ytbank.exceptionsHandler.exceptions.AccessDeniedException
import sindat.pet_projects.ytbank.users.obj.UserEntity
import sindat.pet_projects.ytbank.users.obj.Permission

@Service
class PermissionService(private val permissionComparator: Comparator<Permission>) {

    @Throws(PermissionDeniedDataAccessException::class)
    fun authorizePermissionBase(userToCheck: UserEntity) {
        if (permissionComparator.compare(userToCheck.permissionLevel, Permission.BASE) < 0) {
            throw AccessDeniedException()
        }
    }
}