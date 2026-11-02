# Clear — Features and Workflows

[All projects](../../README.md) · [Project home](README.md) · [Story](build-log.md) · [Features](features.md) · [Screenshots](photos.md) · [Desktop view](photos.md#website-version) · [Mobile view](photos.md#mobile-version) · [Results](results.md) · [Sources](sources.md) · [Portfolio](https://github.com/CodedWithCaffein/Michael-Polanczyk-Portfolio)

## Workspace areas

| Area | Purpose |
| --- | --- |
| Notes | Save information to return to later |
| Lists | Organize tasks and mark steps complete |
| Reminders | Track tasks and due dates |
| Goals | Break larger plans into smaller steps |
| Calendar | Keep upcoming events together |
| Finances | Record income, expenses, and running balances |
| Receipts | Keep purchase records available for review |
| Wellness records | Store dated check-ins |
| Mail previews | Review imported inbox summaries |
| Assistant connection | Read and update supported records through conversation |

This describes the supported areas, rather than a completed test of every screen and workflow.

## Example workflows

For a task, I want to keep the relevant note, checklist, and deadline together. The aim is to avoid entering the same details in several places.

For a purchase, the receipt and transaction serve different purposes. The receipt preserves the purchase details, while the transaction supplies the amount used in financial totals. Uploading a receipt alone does not add an expense.

For an import, I want the saved information to include its source and update time. That helps distinguish an older record from a current update.

## Keeping information accurate

Repeated imports should avoid creating duplicates. Partial updates should preserve unrelated fields, and missing measurements should remain unknown.

Sources also need to update independently. If one is unavailable, existing records should remain available and other sources should still be able to proceed. This is intended behavior that needs repeatable testing.

## Current limits

The connected workflows run outside Clear. They do not establish that the website maintains continuous direct connections to every source.

Saving a reminder does not establish notification delivery. Saving an event does not establish two-way calendar syncing. A stored wellness check-in does not establish a continuous connection to a device's health database.
