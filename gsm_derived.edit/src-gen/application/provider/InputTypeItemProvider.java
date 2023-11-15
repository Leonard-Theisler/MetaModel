/**
 */
package application.provider;

import application.Gsm_derivedPackage;
import application.InputType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link application.InputType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InputTypeItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addValuePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addRootElementPropertyDescriptor(object);
			addSchemaUriPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InputType_value_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InputType_value_feature",
								"_UI_InputType_type"),
						Gsm_derivedPackage.Literals.INPUT_TYPE__VALUE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InputType_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InputType_id_feature",
								"_UI_InputType_type"),
						Gsm_derivedPackage.Literals.INPUT_TYPE__ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Root Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InputType_rootElement_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InputType_rootElement_feature",
								"_UI_InputType_type"),
						Gsm_derivedPackage.Literals.INPUT_TYPE__ROOT_ELEMENT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Schema Uri feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchemaUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InputType_schemaUri_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InputType_schemaUri_feature",
								"_UI_InputType_type"),
						Gsm_derivedPackage.Literals.INPUT_TYPE__SCHEMA_URI, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns InputType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InputType"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((InputType) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_InputType_type")
				: getString("_UI_InputType_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(InputType.class)) {
		case Gsm_derivedPackage.INPUT_TYPE__VALUE:
		case Gsm_derivedPackage.INPUT_TYPE__ID:
		case Gsm_derivedPackage.INPUT_TYPE__ROOT_ELEMENT:
		case Gsm_derivedPackage.INPUT_TYPE__SCHEMA_URI:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Gsm_derivedEditPlugin.INSTANCE;
	}

}
