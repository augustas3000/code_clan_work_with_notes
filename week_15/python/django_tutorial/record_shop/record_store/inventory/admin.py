from django.contrib import admin

# Register your models here.
from inventory.models import *

admin.site.register(Artist)
admin.site.register(Album)
