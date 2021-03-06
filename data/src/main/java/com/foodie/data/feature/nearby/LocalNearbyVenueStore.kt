package com.foodie.data.feature.nearby

import androidx.paging.DataSource
import com.foodie.data.config.di.kodeinInstance
import com.foodie.data.data.db.DatabaseTransactionRunner
import com.foodie.data.data.db.daos.NearbyVenueEntryDao
import com.foodie.data.entities.NearbyEntryWithVenue
import com.foodie.data.entities.NearbyVenueEntry
import com.foodie.data.feature.common.LocalStore
import io.reactivex.Flowable
import org.kodein.di.generic.instance

/**
 * @author Vipul Kumar; dated 21/12/18.
 *
 * Local store to perform database operations.
 */
class LocalNearbyVenueStore : LocalStore() {
    private val transactionRunner: DatabaseTransactionRunner by kodeinInstance.instance()
    private val nearbyVenueEntryDao: NearbyVenueEntryDao by kodeinInstance.instance()

    fun observeForFlowable(
        count: Int,
        offset: Int
    ): Flowable<List<NearbyEntryWithVenue>> {
        return nearbyVenueEntryDao.entriesFlowable(count, offset)
    }

    fun observeForPaging(): DataSource.Factory<Int, NearbyEntryWithVenue> =
        nearbyVenueEntryDao.entriesDataSource()

    fun saveVenueEntries(page: Int, entries: List<NearbyVenueEntry>) =
        transactionRunner {
            val entriesSae = entries.distinctBy { it.venueId }
            nearbyVenueEntryDao.deletePage(page)
            nearbyVenueEntryDao.insertAll(entriesSae)
        }

    fun deleteAll() = nearbyVenueEntryDao.deleteAll()

    fun getLastPage(): Int? = nearbyVenueEntryDao.getLastPage()
}
